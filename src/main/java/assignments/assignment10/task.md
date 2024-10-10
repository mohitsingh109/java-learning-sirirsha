
# Java Collections Assignment

**Objective**:  
The goal of this assignment is to help students gain hands-on experience with Java's Collections Framework by using `List`, `Set`, and `Map`. Students will perform operations such as sorting, filtering, searching, updating, and using utility methods from `Collections`.

---

## Scenario:
You are tasked with building a small application to manage a music library. This application should store details about songs, albums, and artists using various Java collections like `List`, `Set`, and `Map`.

## Requirements:

### 1. Create the `Song` Class
Define a `Song` class with the following attributes:
- `String title`
- `String artist`
- `String album`
- `int duration` (in seconds)

Implement:
- A constructor for initializing these fields.
- `equals()` and `hashCode()` methods based on `title` and `artist`.
- `toString()` to print the song details.

### 2. Operations with `List`
- **Create a list of songs**: Store at least 10 different `Song` objects in a `List<Song>`.
- **Sort the list** by song title and print the sorted list. Use `Collections.sort()` or a `Comparator` for this.
- **Search for a song** by title in the list using `Collections.binarySearch()`.
- **Filter songs** by a specific artist and display only those songs.

### 3. Operations with `Set`
- **Create a set of artists**: Using a `Set<String>`, store the unique names of all artists from your song list.
- Add duplicate artist names intentionally and demonstrate that a `Set` does not allow duplicates.
- **Display all unique artists** by iterating over the `Set`.

### 4. Operations with `Map`
- **Create a `Map` to group songs by album**: Use a `Map<String, List<Song>>` where the key is the album name, and the value is a list of songs from that album.
- Add songs to the map by looping through your `List<Song>`.
- **Print all albums and the songs in each album**.
- **Update an album**: Modify the song list for a particular album by adding or removing songs.

### 5. Utility Methods
- Use `Collections.max()` and `Collections.min()` to find the song with the longest and shortest duration.
- Shuffle the song list using `Collections.shuffle()` and print the shuffled list.

---

## Example Tasks:

### 1. Sort songs by title:
```java
Collections.sort(songList, Comparator.comparing(Song::getTitle));
System.out.println("Sorted Songs: " + songList);
```

### 2. Search for a song by title:
```java
Song searchResult = new Song("Shape of You", "Ed Sheeran", "Divide", 233);
int index = Collections.binarySearch(songList, searchResult, Comparator.comparing(Song::getTitle));
System.out.println("Song found at index: " + index);
```

### 3. Add artists to a set:
```java
Set<String> artists = new HashSet<>();
for (Song song : songList) {
    artists.add(song.getArtist());
}
System.out.println("Unique Artists: " + artists);
```

### 4. Group songs by album in a map:
```java
Map<String, List<Song>> albumMap = new HashMap<>();
for (Song song : songList) {
    albumMap.computeIfAbsent(song.getAlbum(), k -> new ArrayList<>()).add(song);
}
System.out.println("Songs grouped by album: " + albumMap);
```

### 5. Shuffle the song list:
```java
Collections.shuffle(songList);
System.out.println("Shuffled Songs: " + songList);
```

---
