package telegrambot;

import org.telegram.telegrambots.meta.api.objects.Update;
import static telegrambot.TelegramBotContent.*;

import java.util.Map;

public class TelegramBot extends MultiSessionTelegramBot {
    
    private static final String NAME = "CodeGymBot_bot";
    private static final String TOKEN = System.getenv("TELEGRAM_TOKEN");

    public TelegramBot() {
        super(NAME, TOKEN);
    }

    @Override
    public void onUpdateEventReceived(Update update) {
        // TODO: escribiremos la funcionalidad principal del bot aquí
        if (getMessageText().equals("/start")){
            //sendTextMessageAsync("Hola _futuro_ *programador*");
            setUserGlory(0);
            sendPhotoMessageAsync("step_1_pic");
            sendTextMessageAsync(STEP_1_TEXT,
                    Map.of("Hackear la nevera", "step_1_btn"));
        }
        if (getCallbackQueryButtonKey().equals("step_1_btn")){
            setUserGlory(20);
            sendPhotoMessageAsync("step_2_pic");
            sendTextMessageAsync(STEP_2_TEXT,
                    Map.of("¡Tomar una salchicha! +20 de fama", "step_2_btn",
                            "¡Tomar un pescado! +20 de fama", "step_2_btn",
                            "¡Tirar una lata de pepinillos! +20 de fama", "step_2_btn"));
        }
        if (getCallbackQueryButtonKey().equals("step_2_btn")){
            addUserGlory(20);
            sendPhotoMessageAsync("step_3_pic");
            sendTextMessageAsync(STEP_3_TEXT,
                    Map.of("Hackear al robot aspiradora", "step_3_btn"));
        }
        if (getCallbackQueryButtonKey().equals("step_3_btn")){
            addUserGlory(30);
            sendPhotoMessageAsync("step_4_pic");
            sendTextMessageAsync(STEP_4_TEXT,
                    Map.of("Enviar al robot aspirador a por comida! +30 de fama", "step_4_btn",
                            "Dar un paseo en el robot aspirador +30 de fama", "step_4_btn",
                            "¡Huir del robot aspirador! +30 de fama", "step_4_btn"));
        }
        if (getCallbackQueryButtonKey().equals("step_4_btn")){
            addUserGlory(40);
            sendPhotoMessageAsync("step_5_pic");
            sendTextMessageAsync(STEP_5_TEXT,
                    Map.of("¡Encender y ponerse la GoPro!","step_5_btn"));
        }
        if (getCallbackQueryButtonKey().equals("step_5_btn")){
            addUserGlory(40);
            sendPhotoMessageAsync("step_6_pic");
            sendTextMessageAsync(STEP_6_TEXT,
                    Map.of("¡Correr por los tejados, grabar con la GoPro! +40 de fama", "step_6_btn",
                            "¡Atacar a otros gatos desde tu escondite con la GoPro! +40 de fama", "step_6_btn",
                            "¡Atacar a los perros desde tu escondite con la GoPro! +40 de fama", "step_6_btn"));
        }
        if (getCallbackQueryButtonKey().equals("step_6_btn")){
            addUserGlory(50);
            sendPhotoMessageAsync("step_7_pic");
            sendTextMessageAsync(STEP_7_TEXT,
                    Map.of("Romper la contraseña","step_7_btn"));
        }
        if (getCallbackQueryButtonKey().equals("step_7_btn")){
            addUserGlory(50);
            sendPhotoMessageAsync("step_8_pic");
            sendTextMessageAsync(STEP_8_TEXT,
                    Map.of("Salir al patio","step_8_btn"));
        }
        if (getCallbackQueryButtonKey().equals("step_8_btn")){
            addUserGlory(50);
            sendPhotoMessageAsync("final_pic");
            sendTextMessageAsync(FINAL_TEXT);
        }
    }
}