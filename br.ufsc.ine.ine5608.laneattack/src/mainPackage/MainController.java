/*
 * Universidade Federal de Santa Catarina - UFSC
 * Centro Tecnológico - CTC
 * INE5608 - Análise e Projeto de Sistemas - 2018.2
 */
package mainPackage;

import CharacterPackage.CharacterController;
import ClassPackage.ClassController;
import NetGamesPackage.NetGamesController;
import PlayerPackage.PlayerController;
import RoundPackage.RoundController;

/**
 *
 * @author Vinicius Nascimento
 * @author Darlan Guilherme
 */
public class MainController {
    private NetGamesController netGamesController;
    private CharacterController characterController;
    private RoundController roundController;
    private PlayerController playerController;
    private ClassController classController;
    private MainScreen mainScreen;
    
    public MainController(){
        this.netGamesController = new NetGamesController(this);
        this.characterController = new CharacterController(this);
        this.roundController = new RoundController(this);
        this.playerController = new PlayerController(this);
        this.classController = new ClassController(this);
        this.mainScreen = new MainScreen(this);
    }
    
    public void beginProgram(){
        this.mainScreen.setVisible(true);
    }

    public NetGamesController getNetGamesController() {
        return netGamesController;
    }

    public CharacterController getCharacterController() {
        return characterController;
    }

    public RoundController getRoundController() {
        return roundController;
    }

    public PlayerController getPlayerController() {
        return playerController;
    }

    public ClassController getClassController() {
        return classController;
    }  
    
}
