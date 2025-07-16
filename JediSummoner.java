public class JediSummoner {
    public static Jedi summonJedi(String jediName) {
     
     Jedi jedi = null;    

     switch (jediName){   
        case "Luke" :
            return new LukeSkywalker(); 
        case "Rey" :
            return new ReySkywalker(); 
        case "Anikan" :
            return new AnikanSkywalker(); 

        default:
            return jedi; 
        }   
    }
}

