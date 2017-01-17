package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.mygdx.game.Screens.TitleScreen;

public class MyGdxGame extends Game {

	static public Skin gameSkin;

	public void create () {
		gameSkin = new Skin(Gdx.files.internal("skin/glassy-ui.json"));
		this.setScreen(new TitleScreen(this));
	}

	public void render () {
		super.render();
	}
	

	public void dispose () {
	}
}
