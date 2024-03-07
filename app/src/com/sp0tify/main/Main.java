package com.sp0tify.main;

import java.awt.*;

import com.sp0tify.control.*;
import com.sp0tify.model.*;
import com.sp0tify.view.*;

public class Main {
	
	/**
	 * Esegue il codice
	 * @param args
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
//-------------------------------------------FINESTRA------------------------------------------------------------------------------------	
					
					Finestra frame = new Finestra();
					
//-------------------------------------------ARRAY (model)------------------------------------------------------------------------------------					
					
					ArrayCanzoni arrayCanzoni=new ArrayCanzoni();
					ArrayDettagliCanzoni arrayDettagliCanzoni=new ArrayDettagliCanzoni();
					arrayDettagliCanzoni.setArrayCanzoni(arrayCanzoni);
					ArrayCanzoniPreferiti arrayCanzoniPreferiti = new ArrayCanzoniPreferiti();
					
					DettagliCanzoni c1;
					
//-------------------------------------------INSERIMENTO CANZONI------------------------------------------------------------------------------------
					
					c1=new DettagliCanzoni("What Is Love","Haddaway",246000,"src/media/music/What_Is_Love.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);
					
					c1=new DettagliCanzoni("Stayin Alive","Bee Gees",245400,"src/media/music/Stayin_Alive.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);
					
					c1=new DettagliCanzoni("Danza Kuduro","Don Omar ft. Lucenzo",190800,"src/media/music/Danza_Kuduro.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);
					
					c1=new DettagliCanzoni("Nightcall","Kavinski",249600,"src/media/music/Nightcall.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);
					
					c1=new DettagliCanzoni("Under Pressure","Queen ft. David Bowie",244800,"src/media/music/Under_Pressure.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);
					
					c1=new DettagliCanzoni("One More Time","Daft_Punk",312000,"src/media/music/One_More_Time.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);
					
					c1=new DettagliCanzoni("Feel Good Inc","Gorillaz",204600,"src/media/music/Feel_Good_Inc.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);

					c1=new DettagliCanzoni("Where Is My Mind","Pixies",229000,"src/media/music/Where_Is_My_Mind.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);

					c1=new DettagliCanzoni("Viva La Vida","Coldplay",241000,"src/media/music/Viva_La_Vida.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);

					c1=new DettagliCanzoni("Dont Stop Me Now","Queen",209000,"src/media/music/Dont_Stop_Me_Now.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);

					c1=new DettagliCanzoni("Futsal Shuffle 2020","Lil Uzi Vert",198000,"src/media/music/Futsal_Shuffle_2020.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);

					c1=new DettagliCanzoni("New Tank","Playboi Carti",89000,"src/media/music/New_Tank.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);

					c1=new DettagliCanzoni("Long Time(Intro)","Playboi Carti",211000,"src/media/music/Long_TimeIntro.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);

					c1=new DettagliCanzoni("Italiano Anthem","Sfera Ebbasta",146000,"src/media/music/Italiano_Anthem.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);

					c1=new DettagliCanzoni("Tran Tran","Sfera Ebbasta",252000,"src/media/music/Tran_Tran.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);

					c1=new DettagliCanzoni("Freestyle 3","Ken Carson",142000,"src/media/music/Freestyle_3.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);

					c1=new DettagliCanzoni("Ferrari Remix","James Hype ft. Lazza",172000,"src/media/music/Ferrari_Remix.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);

					c1=new DettagliCanzoni("Gelosa","Finesse ft.Shiva, Sfera Ebbasta, Guè",179000,"src/media/music/Gelosa.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);

					c1=new DettagliCanzoni("Italiana","J-Ax ft.Fedez",180000,"src/media/music/Italiana.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);

					c1=new DettagliCanzoni("Sofia","Alvaro Soler",213000,"src/media/music/Sofia.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);

					c1=new DettagliCanzoni("Lush Life","Zara Larsson",197000,"src/media/music/Lush_Life.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);

					c1=new DettagliCanzoni("Limbo","Daddy Yankee",224000,"src/media/music/Limbo.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);

					c1=new DettagliCanzoni("Outside","Calvin _Harris ft. Ellie Goulding",227000,"src/media/music/Outside.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);

					c1=new DettagliCanzoni("Payphone","Maroon 5",232000,"src/media/music/Payphone.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);

					c1=new DettagliCanzoni("Titi Me Pregunto","Bad Bunny",243000,"src/media/music/Titi_Me_Pregunto.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);

					c1=new DettagliCanzoni("WorldCup","IShowSpeed",269000,"src/media/music/WorldCup.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);
					
					c1=new DettagliCanzoni("Sweet Home Chicago","The Blues Brothers",467000,"src/media/music/Sweet_Home_Chicago.wav");
                    arrayCanzoni.inserimento(c1.getPercorsoFile());
                    arrayDettagliCanzoni.inserimento(c1);
                    
                    c1=new DettagliCanzoni("Positivity Possibility","Emeterians",274000,"src/media/music/Positivity_Possibility.wav");
					arrayCanzoni.inserimento(c1.getPercorsoFile());
					arrayDettagliCanzoni.inserimento(c1);

					
//-------------------------------------------CONTROLLER---------------------------------------------------------------------------------					
					
					
					new MainController(frame.getContainerBottoni(), 
							frame.getPannelloHome(), frame.getDynamicMixer(), frame.getPannelloLateralePlaylist(), 
							frame.getpannelloHomePlaylist(), frame.getPannelloLibreria(), frame, arrayCanzoni, arrayDettagliCanzoni, 
							arrayCanzoniPreferiti, frame.getPannelloLikedSongs(), frame.getPannelloCerca());

//--------------------------------------------------------------------------------------------------------------------------------------					
					
					frame.setVisible(true);	

				} 
				
				catch (Exception e) {
					e.printStackTrace();
				}
				
			}

			
			
		});
		
	}

}
