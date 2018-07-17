
//import java.beans.EventHandler;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

//import com.squareup.okhttp.internal.Platform;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.api.AuthenticationApi;
import io.swagger.client.api.BufferApi;
import io.swagger.client.api.BusinessUnitsApi;
import io.swagger.client.api.DocumentTypesApi;
import io.swagger.client.api.DocumentsApi;
import io.swagger.client.api.MasksApi;
import io.swagger.client.api.PredefinedProfilesApi;
import io.swagger.client.api.ProfilesApi;
import io.swagger.client.api.SearchesApi;
import io.swagger.client.api.SearchesV2Api;
import io.swagger.client.api.StatesApi;
import io.swagger.client.api.TaskWorkApi;
import io.swagger.client.model.AuthenticationTokenDTO;
import io.swagger.client.model.AuthenticationTokenRequestDTO;
import io.swagger.client.model.BusinessUnitDTO;
import io.swagger.client.model.ColumnSearchResult;
import io.swagger.client.model.DocumentTypeBaseDTO;
import io.swagger.client.model.DocumentTypeFieldDTO;
import io.swagger.client.model.FieldBaseDTO;
import io.swagger.client.model.FieldBaseForSearchDTO;
import io.swagger.client.model.FieldBaseForSearchStringDto;
import io.swagger.client.model.FieldBaseForSelectDTO;
import io.swagger.client.model.FileDTO;
import io.swagger.client.model.MaskDTO;
import io.swagger.client.model.MaskProfileSchemaDTO;
import io.swagger.client.model.OriginFieldDTO;
import io.swagger.client.model.PredefinedProfileDTO;
import io.swagger.client.model.ProfileDTO;
import io.swagger.client.model.ProfileResultDTO;
import io.swagger.client.model.RefreshTokenRequestDTO;
import io.swagger.client.model.RowSearchResult;
import io.swagger.client.model.SearchCriteriaDto;
import io.swagger.client.model.SearchCriteriaMultipleDto;
import io.swagger.client.model.SearchDTO;
import io.swagger.client.model.SelectDTO;
import io.swagger.client.model.StateFieldDTO;
import io.swagger.client.model.SubjectFieldDTO;
import io.swagger.client.model.TaskWorkRequestDTO;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Callback;

@SuppressWarnings("restriction")
public class ViewMain extends Application
{
	Stage _primaryStage;

	TextField txtUrl = new TextField();
	TextField txtClientId = new TextField();
	TextField txtClientSecret = new TextField();
	TextField txtUsername = new TextField();
	PasswordField txtPassword = new PasswordField();
	TextArea txtInfo = new TextArea();

	ObservableList<ObservableList> data1;
	TableView table1 = new TableView();

	String accessToken;
	String refreshToken;

	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("Test Next Java");

		Label label1 = new Label("Api URL");
		txtUrl.setMinWidth(200);
		txtUrl.setText("http://localhost/ARXivarNextWebApi/");

		Label label2 = new Label("ClientId");
		txtClientId.setMinWidth(200);
		txtClientId.setText("ArxivarNextDev");

		Label label3 = new Label("ClientSecret");
		txtClientSecret.setMinWidth(200);
		txtClientSecret.setText("6D4F6AC718874FFC");

		Label label4 = new Label("Username");
		txtUsername.setMinWidth(200);
		txtUsername.setText("admin");

		Label label5 = new Label("Password");
		txtPassword.setMinWidth(200);
		txtPassword.setText("123");

		VBox vbox1 = new VBox();
		vbox1.setSpacing(10);
		vbox1.setPadding(new Insets(10, 10, 10, 10));
		vbox1.getChildren().addAll(label1, txtUrl, label2, txtClientId, label3, txtClientSecret, label4, txtUsername,
				label5, txtPassword);

		Button button1 = new Button();
		button1.setText("Login");
		button1.setMinWidth(150);
		button1.setOnAction(new EventHandler<ActionEvent>()
		{

			@Override
			public void handle(ActionEvent event)
			{
				Platform.runLater(() ->
				{
					EseguiLogin();
				});
			}
		});

		Button button1b = new Button();
		button1b.setText("Refresh token");
		button1b.setMinWidth(150);
		button1b.setOnAction(new EventHandler<ActionEvent>()
		{

			@Override
			public void handle(ActionEvent event)
			{
				Platform.runLater(() ->
				{
					EseguiRefreshToken();
				});
			}
		});

		Button button2 = new Button();
		button2.setText("Get AOO");
		button2.setMinWidth(150);
		button2.setOnAction(new EventHandler<ActionEvent>()
		{

			@Override
			public void handle(ActionEvent event)
			{
				Platform.runLater(() ->
				{
					EseguiGetAOO();
				});
			}
		});

		Button button3 = new Button();
		button3.setText("Get DocumentTypes");
		button3.setMinWidth(150);
		button3.setOnAction(new EventHandler<ActionEvent>()
		{

			@Override
			public void handle(ActionEvent event)
			{
				Platform.runLater(() ->
				{
					EseguiGetDocumentTypes();
				});
			}
		});

		Button button4 = new Button();
		button4.setText("Get Masks");
		button4.setMinWidth(150);
		button4.setOnAction(new EventHandler<ActionEvent>()
		{

			@Override
			public void handle(ActionEvent event)
			{
				Platform.runLater(() ->
				{
					EseguiGetMasks();
				});
			}
		});

		Button button5 = new Button();
		button5.setText("Get PredefinedProfiles");
		button5.setMinWidth(150);
		button5.setOnAction(new EventHandler<ActionEvent>()
		{

			@Override
			public void handle(ActionEvent event)
			{
				Platform.runLater(() ->
				{
					EseguiGetPredefinedProfiles();
				});
			}
		});

		Button button6 = new Button();
		button6.setText("Get Search (string)");
		button6.setMinWidth(150);
		button6.setOnAction(new EventHandler<ActionEvent>()
		{

			@Override
			public void handle(ActionEvent event)
			{
				Platform.runLater(() ->
				{
					EseguiGetSearchString();
				});
			}
		});

		Button button7 = new Button();
		button7.setText("Get SearchV2 (string)");
		button7.setMinWidth(150);
		button7.setOnAction(new EventHandler<ActionEvent>()
		{

			@Override
			public void handle(ActionEvent event)
			{
				Platform.runLater(() ->
				{
					EseguiGetSearchV2String();
				});
			}
		});

		Button button9 = new Button();
		button9.setText("Get Profile");
		button9.setMinWidth(150);
		button9.setOnAction(new EventHandler<ActionEvent>()
		{

			@Override
			public void handle(ActionEvent event)
			{
				Platform.runLater(() ->
				{
					EseguiGetProfile();
				});
			}
		});

		Button button10 = new Button();
		button10.setText("Import Profile");
		button10.setMinWidth(150);
		button10.setOnAction(new EventHandler<ActionEvent>()
		{

			@Override
			public void handle(ActionEvent event)
			{
				Platform.runLater(() ->
				{
					EseguiImportProfile();
				});
			}
		});

		Button button8 = new Button();
		button8.setText("Get Tasks");
		button8.setMinWidth(150);
		button8.setOnAction(new EventHandler<ActionEvent>()
		{

			@Override
			public void handle(ActionEvent event)
			{
				Platform.runLater(() ->
				{
					EseguiGetTasks();
				});
			}
		});

		VBox vbox2 = new VBox();
		vbox2.setSpacing(10);
		vbox2.setPadding(new Insets(10, 10, 10, 10));
		vbox2.getChildren().addAll(button1, button1b, button2, button3, button4, button5, button6, button7, button9,
				button10, button8);

		Label label6 = new Label("Informazioni");
		txtInfo.setPrefWidth(500);
		txtInfo.setPrefHeight(250);

		VBox vbox3 = new VBox();
		vbox3.setSpacing(10);
		vbox3.setPadding(new Insets(10, 10, 10, 10));
		vbox3.getChildren().addAll(label6, txtInfo);

		HBox hbox1 = new HBox();
		hbox1.setSpacing(10);
		hbox1.getChildren().addAll(vbox1, vbox2, vbox3);

		VBox vbox4 = new VBox();
		vbox4.setSpacing(10);
		vbox4.setPadding(new Insets(10, 10, 10, 10));
		vbox4.getChildren().addAll(hbox1, table1);

		StackPane root = new StackPane();
		root.getChildren().add(vbox4);
		primaryStage.setScene(new Scene(root, 800, 600));
		primaryStage.show();
		_primaryStage = primaryStage;
	}

	private void EseguiLogin()
	{
		Logga("----------------------------------------");
		Logga("Inizio EseguiLogin");

		try
		{
			ApiClient apiClient = new ApiClient();
			apiClient.setBasePath(txtUrl.getText());

			AuthenticationTokenRequestDTO authenticationTokenRequestDTO = new AuthenticationTokenRequestDTO();
			authenticationTokenRequestDTO.setClientId(txtClientId.getText());
			authenticationTokenRequestDTO.setClientSecret(txtClientSecret.getText());
			authenticationTokenRequestDTO.setUsername(txtUsername.getText());
			authenticationTokenRequestDTO.setPassword(txtPassword.getText());

			AuthenticationApi authenticationApi = new AuthenticationApi(apiClient);
			AuthenticationTokenDTO authenticationTokenDTO = authenticationApi
					.authenticationGetToken(authenticationTokenRequestDTO);
			accessToken = authenticationTokenDTO.getAccessToken();
			refreshToken = authenticationTokenDTO.getRefreshToken();
		}
		catch (ApiException ex)
		{
			Logga("ApiException");
			Logga(ex.getResponseBody());
		}

		Logga("Fine EseguiLogin");
		Logga("----------------------------------------");
	}

	private void EseguiRefreshToken()
	{
		Logga("----------------------------------------");
		Logga("Inizio EseguiRefreshToken");

		try
		{
			ApiClient apiClient = new ApiClient();
			apiClient.setBasePath(txtUrl.getText());
			if (accessToken != null)
			{
				apiClient.setApiKey(accessToken);
				apiClient.setApiKeyPrefix("Bearer");
			}

			RefreshTokenRequestDTO refreshTokenRequestDTO = new RefreshTokenRequestDTO();
			refreshTokenRequestDTO.setClientId(txtClientId.getText());
			refreshTokenRequestDTO.setClientSecret(txtClientSecret.getText());
			refreshTokenRequestDTO.setRefreshToken(refreshToken);

			AuthenticationApi authenticationApi = new AuthenticationApi(apiClient);
			AuthenticationTokenDTO authenticationTokenDTO = authenticationApi
					.authenticationRefresh(refreshTokenRequestDTO);
			accessToken = authenticationTokenDTO.getAccessToken();
			refreshToken = authenticationTokenDTO.getRefreshToken();
		}
		catch (ApiException ex)
		{
			Logga("ApiException");
			Logga(ex.getResponseBody());
		}

		Logga("Fine EseguiRefreshToken");
		Logga("----------------------------------------");
	}

	private void EseguiGetAOO()
	{
		Logga("----------------------------------------");
		Logga("Inizio EseguiGetAOO");

		try
		{
			ApiClient apiClient = new ApiClient();
			apiClient.setBasePath(txtUrl.getText());
			if (accessToken != null)
			{
				apiClient.setApiKey(accessToken);
				apiClient.setApiKeyPrefix("Bearer");
			}

			BusinessUnitsApi businessUnitsApi = new BusinessUnitsApi(apiClient);
			List<BusinessUnitDTO> listBusinessUnitsDTO = businessUnitsApi.businessUnitsGet(null, null);

			VisualizzaInGriglia(listBusinessUnitsDTO);
		}
		catch (ApiException ex)
		{
			Logga("ApiException");
			Logga(ex.getResponseBody());
		}

		Logga("Fine EseguiGetAOO");
		Logga("----------------------------------------");
	}

	private void EseguiGetDocumentTypes()
	{
		Logga("----------------------------------------");
		Logga("Inizio EseguiGetDocumentTypes");

		try
		{
			ApiClient apiClient = new ApiClient();
			apiClient.setBasePath(txtUrl.getText());
			if (accessToken != null)
			{
				apiClient.setApiKey(accessToken);
				apiClient.setApiKeyPrefix("Bearer");
			}

			DocumentTypesApi documentTypesApi = new DocumentTypesApi(apiClient);
			List<DocumentTypeBaseDTO> listDocumentTypesApi = documentTypesApi.documentTypesGet(1, "AbleBS");

			VisualizzaInGriglia2(listDocumentTypesApi);
		}
		catch (ApiException ex)
		{
			Logga("ApiException");
			Logga(ex.getResponseBody());
		}

		Logga("Fine EseguiGetDocumentTypes");
		Logga("----------------------------------------");
	}

	private void EseguiGetMasks()
	{
		Logga("----------------------------------------");
		Logga("Inizio EseguiGetMasks");

		try
		{
			ApiClient apiClient = new ApiClient();
			apiClient.setBasePath(txtUrl.getText());
			if (accessToken != null)
			{
				apiClient.setApiKey(accessToken);
				apiClient.setApiKeyPrefix("Bearer");
			}

			MasksApi masksApi = new MasksApi(apiClient);
			List<MaskDTO> listMaskDTO = masksApi.masksGetList();

			VisualizzaInGriglia3(listMaskDTO);
		}
		catch (ApiException ex)
		{
			Logga("ApiException");
			Logga(ex.getResponseBody());
		}

		Logga("Fine EseguiGetMasks");
		Logga("----------------------------------------");
	}

	private void EseguiGetPredefinedProfiles()
	{
		Logga("----------------------------------------");
		Logga("Inizio EseguiGetPredefinedProfiles");

		try
		{
			ApiClient apiClient = new ApiClient();
			apiClient.setBasePath(txtUrl.getText());
			if (accessToken != null)
			{
				apiClient.setApiKey(accessToken);
				apiClient.setApiKeyPrefix("Bearer");
			}

			PredefinedProfilesApi predefinedProfilesApi = new PredefinedProfilesApi(apiClient);
			List<PredefinedProfileDTO> listPredefinedProfileDTO = predefinedProfilesApi.predefinedProfilesGet();

			VisualizzaInGriglia4(listPredefinedProfileDTO);
		}
		catch (ApiException ex)
		{
			Logga("ApiException");
			Logga(ex.getResponseBody());
		}

		Logga("Fine EseguiGetPredefinedProfiles");
		Logga("----------------------------------------");
	}

	private void EseguiGetSearchString()
	{
		Logga("----------------------------------------");
		Logga("Inizio EseguiGetSearchString");

		try
		{
			ApiClient apiClient = new ApiClient();
			apiClient.setBasePath(txtUrl.getText());
			if (accessToken != null)
			{
				apiClient.setApiKey(accessToken);
				apiClient.setApiKeyPrefix("Bearer");
			}

			SearchesApi searchesApi = new SearchesApi(apiClient);
			SelectDTO selectDTO = searchesApi.searchesGetSelect_0(10);
			SearchDTO searchDTO = searchesApi.searchesGet();

			// Imposta una condizione di ricerca su un campo aggiuntivo...
			List<FieldBaseForSearchDTO> listFieldBaseForSearchDTO = searchesApi.searchesGetAdditionalByClasse(2, 10, 0,
					"AbleBS");
			FieldBaseForSearchStringDto codiceFattura = null;
			for (FieldBaseForSearchDTO item : listFieldBaseForSearchDTO)
			{
				if (item.getDescription().equalsIgnoreCase("codice fattura"))
				{
					codiceFattura = (FieldBaseForSearchStringDto) item;
					codiceFattura.setOperator(1);
					codiceFattura.setValore1("500");
				}
			}
			searchDTO.addFieldsItem(codiceFattura);

			// Imposta la visualizzazione del campo aggiuntivo...
			for (FieldBaseForSelectDTO item : selectDTO.getFields())
			{
				if (item.getLabel().equalsIgnoreCase("codice fattura"))
				{
					item.setSelected(true);
				}
			}

			// Esegui estrazione dei dati...
			SearchCriteriaDto searchCriteriaDto = new SearchCriteriaDto();
			searchCriteriaDto.setSelectFilterDto(selectDTO);
			searchCriteriaDto.setSearchFilterDto(searchDTO);
			List<RowSearchResult> listRowSearchResult = searchesApi.searchesPostSearch(searchCriteriaDto);

			VisualizzaInGriglia5(listRowSearchResult);
		}
		catch (ApiException ex)
		{
			Logga("ApiException");
			Logga(ex.getResponseBody());
		}

		Logga("Fine EseguiGetSearchString");
		Logga("----------------------------------------");
	}

	private void EseguiGetSearchV2String()
	{
		Logga("----------------------------------------");
		Logga("Inizio EseguiGetSearchV2String");

		try
		{
			ApiClient apiClient = new ApiClient();
			apiClient.setBasePath(txtUrl.getText());
			if (accessToken != null)
			{
				apiClient.setApiKey(accessToken);
				apiClient.setApiKeyPrefix("Bearer");
			}

			SearchesV2Api searchesV2Api = new SearchesV2Api(apiClient);
			SelectDTO selectDTO = searchesV2Api.searchesV2GetSelect_0(10);
			List<SearchDTO> searchDTO = searchesV2Api.searchesV2Get();

			// Imposta una condizione di ricerca su un campo aggiuntivo...
			List<FieldBaseForSearchDTO> listFieldBaseForSearchDTO = searchesV2Api.searchesV2GetAdditionalByClasse(2, 10,
					0, "AbleBS");
			FieldBaseForSearchStringDto codiceFattura = null;
			for (FieldBaseForSearchDTO item : listFieldBaseForSearchDTO)
			{
				if (item.getDescription().equalsIgnoreCase("codice fattura"))
				{
					codiceFattura = (FieldBaseForSearchStringDto) item;
					codiceFattura.setOperator(2);
					codiceFattura.setValore1("500");
				}
			}
			searchDTO.get(0).addFieldsItem(codiceFattura);

			// Imposta la visualizzazione del campo aggiuntivo...
			for (FieldBaseForSelectDTO item : selectDTO.getFields())
			{
				if (item.getLabel().equalsIgnoreCase("codice fattura"))
				{
					item.setSelected(true);
				}
			}

			// Esegui estrazione dei dati...
			SearchCriteriaMultipleDto searchCriteriaMultipleDto = new SearchCriteriaMultipleDto();
			searchCriteriaMultipleDto.setSelectFilterDto(selectDTO);
			searchCriteriaMultipleDto.setSearchFilterDtoList(searchDTO);

			List<RowSearchResult> listRowSearchResult = searchesV2Api
					.searchesV2PostSearchMultiple(searchCriteriaMultipleDto);

			VisualizzaInGriglia5(listRowSearchResult);
		}
		catch (ApiException ex)
		{
			Logga("ApiException");
			Logga(ex.getResponseBody());
		}

		Logga("Fine EseguiGetSearchV2String");
		Logga("----------------------------------------");
	}

	private void EseguiGetTasks()
	{
		Logga("----------------------------------------");
		Logga("Inizio EseguiGetTasks");

		try
		{
			ApiClient apiClient = new ApiClient();
			apiClient.setBasePath(txtUrl.getText());
			if (accessToken != null)
			{
				apiClient.setApiKey(accessToken);
				apiClient.setApiKeyPrefix("Bearer");
			}

			TaskWorkApi taskWorkApi = new TaskWorkApi(apiClient);
			SelectDTO selectDTO = taskWorkApi.taskWorkGetDefaultSelect();

			TaskWorkRequestDTO taskWorkRequestDTO = new TaskWorkRequestDTO();
			taskWorkRequestDTO.setSelect(selectDTO);

			List<RowSearchResult> listRowSearchResult = taskWorkApi.taskWorkGetTasks(taskWorkRequestDTO);

			VisualizzaInGriglia5(listRowSearchResult);
		}
		catch (ApiException ex)
		{
			Logga("ApiException");
			Logga(ex.getResponseBody());
		}

		Logga("Fine EseguiGetTasks");
		Logga("----------------------------------------");
	}

	private void EseguiGetProfile()
	{
		Logga("----------------------------------------");
		Logga("Inizio EseguiGetProfile");

		try
		{
			ApiClient apiClient = new ApiClient();
			apiClient.setBasePath(txtUrl.getText());
			if (accessToken != null)
			{
				apiClient.setApiKey(accessToken);
				apiClient.setApiKeyPrefix("Bearer");
			}

			DocumentsApi documentsApi = new DocumentsApi(apiClient);
			ApiResponse<File> file = documentsApi.documentsGetForProfileWithHttpInfo(244, false);

			String filename = file.getHeaders().get("Content-Disposition").toString();
			filename = filename.replaceAll("attachment; filename=", "");
			filename = filename.replace("\"", "");
			filename = filename.replace("[", "");
			filename = filename.replace("]", "");

			copyFileUsingStream(new File(file.getData().getAbsolutePath()), new File(filename));
			Desktop.getDesktop().open(new File(filename));
		}
		catch (ApiException ex)
		{
			Logga("ApiException");
			Logga(ex.getResponseBody());
		}
		catch (IOException ex)
		{
			Logga("IOException");
			Logga(ex.getMessage());
		}

		Logga("Fine EseguiGetProfile");
		Logga("----------------------------------------");
	}

	private void EseguiImportProfile()
	{
		Logga("----------------------------------------");
		Logga("Inizio EseguiImportProfile");

		try
		{
			FileChooser fileChooser = new FileChooser();
			File file = fileChooser.showOpenDialog(_primaryStage);
			if (file != null)
			{
				ApiClient apiClient = new ApiClient();
				apiClient.setBasePath(txtUrl.getText());
				if (accessToken != null)
				{
					apiClient.setApiKey(accessToken);
					apiClient.setApiKeyPrefix("Bearer");
				}

				DocumentTypesApi documentTypesApi = new DocumentTypesApi(apiClient);
				List<DocumentTypeBaseDTO> listDocumentTypesApi = documentTypesApi.documentTypesGet(1, "AbleBS");

				StatesApi statesApi = new StatesApi(apiClient);

				BufferApi bufferApi = new BufferApi(apiClient);
				List<String> bufferIds = bufferApi.bufferInsert(file);

				ProfilesApi profilesApi = new ProfilesApi(apiClient);
				MaskProfileSchemaDTO maskProfileSchemaDTO = profilesApi.profilesGet_0();
				for (FieldBaseDTO item : maskProfileSchemaDTO.getFields())
				{
					if (item.getName().equalsIgnoreCase("DocumentType"))
					{
						((DocumentTypeFieldDTO) item).setValue(listDocumentTypesApi.get(0).getId());
					}
					else if (item.getName().equalsIgnoreCase("DOCNAME"))
					{
						((SubjectFieldDTO) item).setValue("Oggetto di test");
					}
					else if (item.getName().equalsIgnoreCase("Origine"))
					{
						((OriginFieldDTO) item).setValue(0);
					}
					else if (item.getName().equalsIgnoreCase("Stato"))
					{
						((StateFieldDTO) item).setValue(statesApi.statesGet_0().get(0).getId());
					}
				}

				ProfileDTO profileDTO = new ProfileDTO();
				profileDTO.setFields(maskProfileSchemaDTO.getFields());

				FileDTO fileDTO = new FileDTO();
				fileDTO.setBufferIds(bufferIds);
				profileDTO.setDocument(fileDTO);

				ProfileResultDTO profileResultDTO = profilesApi.profilesPost(profileDTO);
				Logga("DocNumber=" + profileResultDTO.getDocNumber());
			}
		}
		catch (ApiException ex)
		{
			Logga("ApiException");
			Logga(ex.getResponseBody());
		}
		catch (Exception ex)
		{
			Logga("Exception");
			Logga(ex.getMessage());
		}

		Logga("Fine EseguiImportProfile");
		Logga("----------------------------------------");
	}

	private void VisualizzaInGriglia(List<BusinessUnitDTO> listBusinessUnitsDTO)
	{
		data1 = FXCollections.observableArrayList();

		table1.getColumns().clear();
		for (int i = 0; i < BusinessUnitDTO.class.getDeclaredFields().length; i++)
		{
			final int j = i;
			TableColumn col = new TableColumn(BusinessUnitDTO.class.getDeclaredFields()[j].getName());
			col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList, String>, ObservableValue<String>>()
			{
				public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param)
				{
					return new SimpleStringProperty(param.getValue().get(j).toString());
				}
			});
			table1.getColumns().addAll(col);
		}

		for (BusinessUnitDTO item : listBusinessUnitsDTO)
		{
			ObservableList<String> row = FXCollections.observableArrayList();
			row.add(item.getCode());
			row.add(item.getName());
			data1.add(row);
		}

		table1.setItems(data1);
	}

	private void VisualizzaInGriglia2(List<DocumentTypeBaseDTO> listDocumentTypesApi)
	{
		data1 = FXCollections.observableArrayList();

		table1.getColumns().clear();
		for (int i = 0; i < DocumentTypeBaseDTO.class.getDeclaredFields().length; i++)
		{
			final int j = i;
			TableColumn col = new TableColumn(DocumentTypeBaseDTO.class.getDeclaredFields()[j].getName());
			col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList, String>, ObservableValue<String>>()
			{
				public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param)
				{
					return new SimpleStringProperty(param.getValue().get(j).toString());
				}
			});
			table1.getColumns().addAll(col);
		}

		for (DocumentTypeBaseDTO item : listDocumentTypesApi)
		{
			ObservableList<String> row = FXCollections.observableArrayList();
			row.add(item.getId().toString());
			row.add(item.getIdParent().toString());
			row.add(item.getKey());
			row.add(item.getDescription());
			row.add(item.getDocumentType().toString());
			row.add(item.getType2().toString());
			row.add(item.getType3().toString());
			row.add(item.getDocState().toString());
			row.add(item.getInOut().toString());
			row.add(item.isIsLeaf().toString());
			row.add(item.getRequireFile().toString());
			row.add(item.getPa().toString());
			row.add(item.isPaDefaultValue().toString());
			data1.add(row);
		}

		table1.setItems(data1);
	}

	private void VisualizzaInGriglia3(List<MaskDTO> listMaskDTO)
	{
		data1 = FXCollections.observableArrayList();

		table1.getColumns().clear();
		for (int i = 0; i < MaskDTO.class.getDeclaredFields().length; i++)
		{
			final int j = i;
			TableColumn col = new TableColumn(MaskDTO.class.getDeclaredFields()[j].getName());
			col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList, String>, ObservableValue<String>>()
			{
				public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param)
				{
					return new SimpleStringProperty(param.getValue().get(j).toString());
				}
			});
			table1.getColumns().addAll(col);
		}

		for (MaskDTO item : listMaskDTO)
		{
			ObservableList<String> row = FXCollections.observableArrayList();
			row.add(item.getId());
			row.add(item.getMaskName());
			row.add(item.getMaskDescription());
			for (int i = row.size(); i < MaskDTO.class.getDeclaredFields().length; i++)
			{
				row.add("");
			}
			data1.add(row);
		}

		table1.setItems(data1);
	}

	private void VisualizzaInGriglia4(List<PredefinedProfileDTO> listPredefinedProfileDTO)
	{
		data1 = FXCollections.observableArrayList();

		table1.getColumns().clear();
		for (int i = 0; i < PredefinedProfileDTO.class.getDeclaredFields().length; i++)
		{
			final int j = i;
			TableColumn col = new TableColumn(PredefinedProfileDTO.class.getDeclaredFields()[j].getName());
			col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList, String>, ObservableValue<String>>()
			{
				public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param)
				{
					return new SimpleStringProperty(param.getValue().get(j).toString());
				}
			});
			table1.getColumns().addAll(col);
		}

		for (PredefinedProfileDTO item : listPredefinedProfileDTO)
		{
			ObservableList<String> row = FXCollections.observableArrayList();
			row.add(item.getId().toString());
			row.add(item.getName());
			row.add(item.getCreationDate().toString());
			for (int i = row.size(); i < PredefinedProfileDTO.class.getDeclaredFields().length; i++)
			{
				row.add("");
			}
			data1.add(row);
		}

		table1.setItems(data1);
	}

	private void VisualizzaInGriglia5(List<RowSearchResult> listRowSearchResult)
	{
		data1 = FXCollections.observableArrayList();

		table1.getColumns().clear();

		for (int i = 0; i < listRowSearchResult.get(0).getColumns().size(); i++)
		{
			final int j = i;
			TableColumn col = new TableColumn(listRowSearchResult.get(0).getColumns().get(j).getLabel());
			col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList, String>, ObservableValue<String>>()
			{
				public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param)
				{
					return new SimpleStringProperty(param.getValue().get(j).toString());
				}
			});
			table1.getColumns().addAll(col);
		}

		for (RowSearchResult item : listRowSearchResult)
		{
			ObservableList<String> row = FXCollections.observableArrayList();
			for (ColumnSearchResult col : item.getColumns())
			{
				if (col.getValue() != null)
				{
					row.add(col.getValue().toString());
				}
				else
				{
					row.add("-");
				}
			}
			data1.add(row);
		}

		table1.setItems(data1);
	}

	private void Logga(String msg)
	{
		String msg2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()) + "|" + msg + "\r\n";
		txtInfo.appendText(msg2);
		System.out.println(msg2);
	}

	private void copyFileUsingStream(File source, File dest) throws IOException
	{
		InputStream is = null;
		OutputStream os = null;
		try
		{
			is = new FileInputStream(source);
			os = new FileOutputStream(dest);
			byte[] buffer = new byte[1024];
			int length;
			while ((length = is.read(buffer)) > 0)
			{
				os.write(buffer, 0, length);
			}
		}
		finally
		{
			is.close();
			os.close();
		}
	}
}
