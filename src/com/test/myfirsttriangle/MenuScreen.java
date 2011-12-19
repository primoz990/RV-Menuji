package com.test.myfirsttriangle;

import java.io.FileInputStream;
import java.io.InputStream;

import android.content.Intent;
import android.util.Log;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.VertexAttribute;
import com.badlogic.gdx.graphics.VertexAttributes.Usage;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class MenuScreen implements ApplicationListener {
	public MyFirstTriangleAndroid fgh;
	//public ActFetch fecthspr;
	
	public void fetchAct(int id)
	{
		//fecthspr.openAct(id);
		fgh.openAct2(0);
	}
	
	
	
	public MenuScreen() 
	{

	}
	
	   
        private PerspectiveCamera camera;
        private Mesh[] faces;
        public int stevec=0;
        private SpriteBatch spb;
    	private BitmapFont font;
    	private Texture texture;
        
        public void create() {

        	
        	if (faces == null) {
        	      faces = new Mesh[25];
        	 
        	      for (int i = 0; i < 25; i++) 
        	      {
        	        faces[i] = new Mesh(true, 4, 4,
        	            new VertexAttribute(Usage.Position, 3, "a_position"),
        	            new VertexAttribute(Usage.ColorPacked, 4, "a_color"));
        	 
        	        faces[i].setIndices(new short[] { 0, 1, 2, 3 });
        	      }
        	      // -------------prvi pravokotnik
        	      faces[0].setVertices(new float[] {//prva - zelena
        	    		  2.5f, 5, 0.5f, Color.toFloatBits(99, 198, 3, 255),
        	    		  -3.5f, 5, 0.5f, Color.toFloatBits(99, 198, 3, 255),
        	    		  2.5f, 4, 0.5f,  Color.toFloatBits(99, 198, 3, 255),
        	    		  -3.5f, 4, 0.5f, Color.toFloatBits(99, 198, 3, 255) });

        	      faces[1].setVertices(new float[] { //zadnja -zelena
        	          2.5f, 5, -0.5f, Color.toFloatBits(133, 176, 10, 255),
        	          -3.5f, 5, -0.5f, Color.toFloatBits(133, 176, 10, 255),
        	          2.5f, 4, -0.5f,  Color.toFloatBits(133, 176, 10, 255),
        	          -3.5f, 4, -0.5f, Color.toFloatBits(133, 176, 10, 255) });
        	 
        	      faces[2].setVertices(new float[] {//zgornja - bela
        	          2.5f, 5, -0.5f, Color.toFloatBits(255, 255, 255, 255),
        	          -3.5f, 5, -0.5f, Color.toFloatBits(255, 255, 255, 255),
        	          2.5f, 5, 0.5f, Color.toFloatBits(255, 255, 255, 255),
        	          -3.5f, 5, 0.5f, Color.toFloatBits(255, 255, 255, 255) });
        	 
        	      faces[3].setVertices(new float[] { //spodnja - rumena
        	          2.5f, 4, -0.5f, Color.toFloatBits(200, 232, 20, 255),
        	          -3.5f, 4, -0.5f, Color.toFloatBits(200, 232, 20, 255),
        	          2.5f, 4, 0.5f, Color.toFloatBits(200, 232, 20, 255),
        	          -3.5f, 4, 0.5f,  Color.toFloatBits(200, 232, 20, 255) });
        	 
        	      faces[4].setVertices(new float[] {//desna - pink
        	          2.5f, 5, 0.5f, Color.toFloatBits(176, 10, 86, 255),
        	          2.5f, 4, 0.5f, Color.toFloatBits(176, 10, 86, 255),
        	          2.5f, 5, -0.5f, Color.toFloatBits(176, 10, 86, 255),
        	          2.5f, 4, -0.5f, Color.toFloatBits(176, 10, 86, 255) });
        	 
        	      faces[5].setVertices(new float[] { //leva - svetlo modra
        	          -3.5f, 5, 0.5f, Color.toFloatBits(10, 176, 176, 255),
        	          -3.5f, 4, 0.5f, Color.toFloatBits(10, 176, 176, 255),
        	          -3.5f, 5, -0.5f, Color.toFloatBits(10, 176, 176, 255),
        	          -3.5f, 4, -0.5f, Color.toFloatBits(10, 176, 176, 255) });
        	      
        	      //--------------------------drugi pravokotnik:
        	      faces[6].setVertices(new float[] {//prva - zelena
        	    		  2.5f, 3, 0.5f, Color.toFloatBits(99, 198, 3, 255),
        	    		  -3.5f, 3, 0.5f, Color.toFloatBits(99, 198, 3, 255),
        	    		  2.5f, 2, 0.5f,  Color.toFloatBits(99, 198, 3, 255),
        	    		  -3.5f, 2, 0.5f, Color.toFloatBits(99, 198, 3, 255) });

        	      faces[7].setVertices(new float[] { //zadnja -zelena
        	          2.5f, 3, -0.5f, Color.toFloatBits(133, 176, 10, 255),
        	          -3.5f, 3, -0.5f, Color.toFloatBits(133, 176, 10, 255),
        	          2.5f, 2, -0.5f,  Color.toFloatBits(133, 176, 10, 255),
        	          -3.5f, 2, -0.5f, Color.toFloatBits(133, 176, 10, 255) });
        	 
        	      faces[8].setVertices(new float[] {//zgornja - bela
        	          2.5f, 3, -0.5f, Color.toFloatBits(255, 255, 255, 255),
        	          -3.5f, 3, -0.5f, Color.toFloatBits(255, 255, 255, 255),
        	          2.5f, 3, 0.5f, Color.toFloatBits(255, 255, 255, 255),
        	          -3.5f, 3, 0.5f, Color.toFloatBits(255, 255, 255, 255) });
        	 
        	      faces[9].setVertices(new float[] { //spodnja - rumena
        	          2.5f, 2, -0.5f, Color.toFloatBits(200, 232, 20, 255),
        	          -3.5f, 2, -0.5f, Color.toFloatBits(200, 232, 20, 255),
        	          2.5f, 2, 0.5f, Color.toFloatBits(200, 232, 20, 255),
        	          -3.5f, 2, 0.5f,  Color.toFloatBits(200, 232, 20, 255) });
        	 
        	      faces[10].setVertices(new float[] {//desna - pink
        	          2.5f, 3, 0.5f, Color.toFloatBits(176, 10, 86, 255),
        	          2.5f, 2, 0.5f, Color.toFloatBits(176, 10, 86, 255),
        	          2.5f, 3, -0.5f, Color.toFloatBits(176, 10, 86, 255),
        	          2.5f, 2, -0.5f, Color.toFloatBits(176, 10, 86, 255) });
        	 
        	      faces[11].setVertices(new float[] { //leva - svetlo modra
        	          -3.5f, 3, 0.5f, Color.toFloatBits(10, 176, 176, 255),
        	          -3.5f, 2, 0.5f, Color.toFloatBits(10, 176, 176, 255),
        	          -3.5f, 3, -0.5f, Color.toFloatBits(10, 176, 176, 255),
        	          -3.5f, 2, -0.5f, Color.toFloatBits(10, 176, 176, 255) });
        	      
        	      
        	    //--------------------tretji pravokotnik:
        	      faces[12].setVertices(new float[] {//prva - zelena
        	    		  2.5f, 1, 0.5f, Color.toFloatBits(99, 198, 3, 255),
        	    		  -3.5f, 1, 0.5f, Color.toFloatBits(99, 198, 3, 255),
        	    		  2.5f, 0, 0.5f,  Color.toFloatBits(99, 198, 3, 255),
        	    		  -3.5f, 0, 0.5f, Color.toFloatBits(99, 198, 3, 255) });

        	      faces[13].setVertices(new float[] { //zadnja -zelena
        	          2.5f, 1, -0.5f, Color.toFloatBits(133, 176, 10, 255),
        	          -3.5f, 1, -0.5f, Color.toFloatBits(133, 176, 10, 255),
        	          2.5f, 0, -0.5f,  Color.toFloatBits(133, 176, 10, 255),
        	          -3.5f, 0, -0.5f, Color.toFloatBits(133, 176, 10, 255) });
        	 
        	      faces[14].setVertices(new float[] {//zgornja - bela
        	          2.5f, 1, -0.5f, Color.toFloatBits(255, 255, 255, 255),
        	          -3.5f, 1, -0.5f, Color.toFloatBits(255, 255, 255, 255),
        	          2.5f, 1, 0.5f, Color.toFloatBits(255, 255, 255, 255),
        	          -3.5f, 1, 0.5f, Color.toFloatBits(255, 255, 255, 255) });
        	 
        	      faces[15].setVertices(new float[] { //spodnja - rumena
        	          2.5f, 0, -0.5f, Color.toFloatBits(200, 232, 20, 255),
        	          -3.5f, 0, -0.5f, Color.toFloatBits(200, 232, 20, 255),
        	          2.5f, 0, 0.5f, Color.toFloatBits(200, 232, 20, 255),
        	          -3.5f, 0, 0.5f,  Color.toFloatBits(200, 232, 20, 255) });
        	 
        	      faces[16].setVertices(new float[] {//desna - pink
        	          2.5f, 1, 0.5f, Color.toFloatBits(176, 10, 86, 255),
        	          2.5f, 0, 0.5f, Color.toFloatBits(176, 10, 86, 255),
        	          2.5f, 1, -0.5f, Color.toFloatBits(176, 10, 86, 255),
        	          2.5f, 0, -0.5f, Color.toFloatBits(176, 10, 86, 255) });
        	 
        	      faces[17].setVertices(new float[] { //leva - svetlo modra
        	          -3.5f, 1, 0.5f, Color.toFloatBits(10, 176, 176, 255),
        	          -3.5f, 0, 0.5f, Color.toFloatBits(10, 176, 176, 255),
        	          -3.5f, 1, -0.5f, Color.toFloatBits(10, 176, 176, 255),
        	          -3.5f, 0, -0.5f, Color.toFloatBits(10, 176, 176, 255) });
        	      
        	      //--------------četrti pravokotnik
        	      faces[18].setVertices(new float[] {//prva - zelena
        	    		  2.5f, -1, 0.5f, Color.toFloatBits(99, 198, 3, 255),
        	    		  -3.5f, -1, 0.5f, Color.toFloatBits(99, 198, 3, 255),
        	    		  2.5f, -2, 0.5f,  Color.toFloatBits(99, 198, 3, 255),
        	    		  -3.5f, -2, 0.5f, Color.toFloatBits(99, 198, 3, 255) });

        	      faces[19].setVertices(new float[] { //zadnja -zelena
        	          2.5f, -1, -0.5f, Color.toFloatBits(133, 176, 10, 255),
        	          -3.5f, -1, -0.5f, Color.toFloatBits(133, 176, 10, 255),
        	          2.5f, -2, -0.5f,  Color.toFloatBits(133, 176, 10, 255),
        	          -3.5f, -2, -0.5f, Color.toFloatBits(133, 176, 10, 255) });
        	 
        	      faces[20].setVertices(new float[] {//zgornja - bela
        	          2.5f, -1, -0.5f, Color.toFloatBits(255, 255, 255, 255),
        	          -3.5f, -1, -0.5f, Color.toFloatBits(255, 255, 255, 255),
        	          2.5f, -1, 0.5f, Color.toFloatBits(255, 255, 255, 255),
        	          -3.5f, -1, 0.5f, Color.toFloatBits(255, 255, 255, 255) });
        	 
        	      faces[21].setVertices(new float[] { //spodnja - rumena
        	          2.5f, -2, -0.5f, Color.toFloatBits(200, 232, 20, 255),
        	          -3.5f, -2, -0.5f, Color.toFloatBits(200, 232, 20, 255),
        	          2.5f, -2, 0.5f, Color.toFloatBits(200, 232, 20, 255),
        	          -3.5f, -2, 0.5f,  Color.toFloatBits(200, 232, 20, 255) });
        	 
        	      faces[22].setVertices(new float[] {//desna - pink
        	          2.5f, -1, 0.5f, Color.toFloatBits(176, 10, 86, 255),
        	          2.5f, -2, 0.5f, Color.toFloatBits(176, 10, 86, 255),
        	          2.5f, -1, -0.5f, Color.toFloatBits(176, 10, 86, 255),
        	          2.5f, -2, -0.5f, Color.toFloatBits(176, 10, 86, 255) });

        	 
        	      faces[23].setVertices(new float[] { //leva - svetlo modra
        	          -3.5f, -1, 0.5f, Color.toFloatBits(10, 176, 176, 255),
        	          -3.5f, -2, 0.5f, Color.toFloatBits(10, 176, 176, 255),
        	          -3.5f, -1, -0.5f, Color.toFloatBits(10, 176, 176, 255),
        	          -3.5f, -2, -0.5f, Color.toFloatBits(10, 176, 176, 255) });
        	      
        	      faces[24].setVertices(new float[] { //ozadje - sivo
        	    		  15, 20, -10, Color.toFloatBits(124, 124, 124, 255),
        	    		  -15, 20, -10, Color.toFloatBits(124, 124, 124, 255),
        	    		  15, -20, -10,  Color.toFloatBits(124, 124, 124, 255),
        	    		  -15, -20, -10, Color.toFloatBits(124, 124, 124, 255) });

        	    }

	        	
	        	
	         
        	// TExturre  /////////// http://code.google.com/p/libgdx/wiki/MeshColorTexture
			FileHandle imageFileHandle = null;
			imageFileHandle = Gdx.files.external("/textura4.jpg");
			texture = new Texture(imageFileHandle);
	       	
        	
        	 Gdx.gl.glEnable(GL10.GL_DEPTH_TEST);
        	 
        	 //text
        	 spb = new SpriteBatch();
   	       	 font= new BitmapFont();
   	         font.setColor(14, 145, 116, 100);

        	    
        }

       // @Override
        public void dispose() 
        { 
        	
        }

        //@Override
        public void pause() { }

        
        int lastTouchX;
        int lastTouchY;

        
        
        
        //@Override
        public void render() 
        {
        	
        	
        	if(stevec==0)
        	{
        		camera.position.x=3.5f;
        		camera.position.y=1.5f;
        		camera.position.z=9;
        	}
        	

        	      String preverjaj=" ";
        	if (Gdx.input.isTouched()) 
        	{
        		lastTouchX = Gdx.input.getX();
        		lastTouchY = Gdx.input.getY();

        		if(lastTouchX>70 && lastTouchX<230)
        		{
        			if(lastTouchY>115 && lastTouchY<165)
        			{
        				preverjaj="zazeni";
        			}
        			else if(lastTouchY>205 && lastTouchY<250)
        			{
        				preverjaj="opis";
        			}
        			else if(lastTouchY>300 && lastTouchY<340)
        			{
        				preverjaj="avtor";
        			}
        			else if(lastTouchY>380 && lastTouchY<420)
        			{
        				System.exit(0); //izhod
        			}
        			
        		}
        		
        		
        		
        		
        		//this.fetchAct(0);
        		
        	      
        	}
        	
        		
        	camera.lookAt(0, 1.5f, 0);
        	 
        	GL10 gl = Gdx.gl10;
        	gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
        	gl.glEnable(GL10.GL_DEPTH_TEST);

            
        	
        	//Gdx.gl.glEnable(GL10.GL_TEXTURE_2D);
        	//texture.bind();
        	
        	camera.update();
        	camera.apply(Gdx.gl10);
        	for (Mesh face : faces) 
        	{
        	    face.render(GL10.GL_TRIANGLE_STRIP, 0, 4);
        	}
        	 
        	try 
        	{
        	      Thread.sleep(16);
        	} catch (InterruptedException e) 
        	{ }
        	
        	stevec++;

        	gl.glDisable(GL10.GL_DEPTH_TEST);
        	
        	
        	//text na gumbe
        	spb.begin();
	       	font.draw(spb, "Aplikacija", 105, 410);
	       	font.draw(spb, "Opis", 117, 325);
	       	font.draw(spb, "Avtor", 117, 235);
	       	font.draw(spb, "Izhod", 117, 150);
	       	font.draw(spb, preverjaj, 130, 30);
	
	       	spb.end();
        	
        }

        //@Override
        public void resize(int width, int height) 
        {
        	 float aspectRatio = (float) width / (float) height;
        	    camera = new PerspectiveCamera(67, 2f * aspectRatio, 2f);
        	    camera.near = 0.1f;
        	    
        	
        }

        //@Override
        public void resume() { }
        
        
        
        
        
        
}