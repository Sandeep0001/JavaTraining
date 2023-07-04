package JavaBasicPrograms;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class RecentlyPlayedMusic {
    /*
OVERVIEW
Create an in-memory store for recently played songs that can accommodate N songs per user, with a fixed initial capacity. This store must have the capability to store a list of song-user pairs, with each song linked to a user. It should also be able to fetch recently played songs based on the user and eliminate the least recently played songs when the store becomes full.
EXAMPLE
Illustration, when 4 different songs were played by a user & Initial capacity is 3:
Let's assume that the user has played 3 songs - S1, S2 and S3.
The playlist would look like -> S1,S2,S3
When S4 song is played -> S2,S3,S4
When S2 song is played -> S3,S4,S2
When S1 song is played -> S4,S2,S1

*/

    private int capacity;
    private Map<String, LinkedList<String>> userMusicStore;

    public RecentlyPlayedMusic(int capacity) {
        this.capacity = capacity;
        this.userMusicStore = new HashMap<>();
    }

    public void addSong(String user, String song) {
        LinkedList<String> playlist = userMusicStore.getOrDefault(user, new LinkedList<>());

        //if song exists in a playlist, remove the song from the place
        if (playlist.contains(song)){
            playlist.remove(playlist.indexOf(song));
        } else if (playlist.size() >= capacity) { // If the playlist reaches capacity, remove the least recently played song
            playlist.removeFirst();
        }

        // Add the song to the end of the playlist
        playlist.addLast(song);

        // Update the playlist in the store
        userMusicStore.put(user, playlist);
    }

    public LinkedList<String> getRecentlyPlayed(String user) {
        return userMusicStore.getOrDefault(user, new LinkedList<>());
    }

    public static void main(String[] args) {
        RecentlyPlayedMusic store = new RecentlyPlayedMusic(3);

        store.addSong("user1", "S1");
        store.addSong("user1", "S2");
        store.addSong("user1", "S3");
        System.out.println("User1 playlist: " + store.getRecentlyPlayed("user1"));

        store.addSong("user1", "S2");
        System.out.println("User1 playlist: " + store.getRecentlyPlayed("user1"));

        store.addSong("user1", "S4");
        System.out.println("User1 playlist: " + store.getRecentlyPlayed("user1"));

        store.addSong("user1", "S2");
        System.out.println("User1 playlist: " + store.getRecentlyPlayed("user1"));

        store.addSong("user1", "S1");
        System.out.println("User1 playlist: " + store.getRecentlyPlayed("user1"));

        store.addSong("user2", "S1");
        store.addSong("user2", "S2");
        store.addSong("user2", "S3");
        System.out.println("User2 playlist: " + store.getRecentlyPlayed("user2"));

        store.addSong("user2", "S4");
        System.out.println("User2 playlist: " + store.getRecentlyPlayed("user2"));

        store.addSong("user2", "S3");
        System.out.println("User2 playlist: " + store.getRecentlyPlayed("user2"));

        store.addSong("user2", "S2");
        System.out.println("User2 playlist: " + store.getRecentlyPlayed("user2"));

        store.addSong("user2", "S1");
        System.out.println("User2 playlist: " + store.getRecentlyPlayed("user2"));
    }
}
