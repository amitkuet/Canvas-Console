package com.alaeddine.messadi.factory;


import com.alaeddine.messadi.validator.*;

public class CommandFactory {
    public Command getCommand(Character cmd) {
        if(cmd == null){
            return null;
        }

        if (cmd.equals('c')){
            return new CmdC();
        } else if (cmd.equals('l')){
            return new CmdL();
        } else if (cmd.equals('r')){
            return new CmdR();
        } else if (cmd.equals('b')){
            return new CmdB();
        }  else if (cmd.equals('q')){
            return new CmdQ();
        }
        return null;
    }
}
