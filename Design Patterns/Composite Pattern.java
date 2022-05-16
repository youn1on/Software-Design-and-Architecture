 //IComponent.java
public interface IComponent {

public void play();
public void setPlaybackSpeed(float speed);
public String getName();
}


//Playlist.java


public class Playlist implements IComponent {

public String playlistName;
public ArrayList<IComponent> playlist = new ArrayList();

public Playlist(String playlistName) {
this.playlistName = playlistName;
}

public void add(IComponent component) {
playlist.add(component);
}
public void remove(IComponent component) {
playlist.remove(component);
}
public void play(){
for(IComponent component : playlist) {
component.play();
}
}
public void setPlaybackSpeed(float speed) {
for(IComponent component : this.playlist){
component.setPlaybackSpeed(speed);
}
}
public String getName() {
return this.playlistName;
}
}

//Song.java
public class Song implements IComponent {
public String songName;
public String artist;
public float speed = 1; // Default playback speed

public Song(String songName, String artist ) {
this.songName = songName;
this.artist = artist;
}

public void play(){
}

public void setPlaybackSpeed(float speed){
this.speed = speed;
}

public String getName(){
return this.songName;
}

public String getArtist(){
return this.artist;
}
}


