# Java Assignment: Adapter Pattern

## Scenario
You are developing a media streaming service that allows users to watch videos from different sources, such as YouTube and Vimeo. However, the existing classes for accessing these platforms have different interfaces. To enable your streaming service to work with these different media classes seamlessly, you decide to implement the Adapter Pattern.

## Assignment Instructions
1. **Implement the Adapter Class**:
    - Create an interface `VideoPlayer` with a method `playVideo(String videoId)` that plays a video.
    - Create classes for each video source:
        - `YouTubePlayer` class that has a method `play(String videoId)` specific to playing YouTube videos.
        - `VimeoPlayer` class that has a method `playVideo(String videoId)` specific to playing Vimeo videos.
    - Create an adapter class named `VideoPlayerAdapter` that implements the `VideoPlayer` interface. This adapter should contain instances of `YouTubePlayer` and `VimeoPlayer` and translate calls to the appropriate method based on the video source.

2. **Demonstrate the Adapter Usage**:
    - Write a main application class that creates instances of `VideoPlayerAdapter` and uses it to play videos from different platforms.
    - Show how the adapter allows the media streaming service to use different video player classes without modifying existing code.

3. **Unit Testing**:
    - Write unit tests to ensure that the `VideoPlayerAdapter` works correctly and can successfully play videos from various sources.

## Interview Question
**Question**: Can you explain the Adapter Pattern and its importance in creating flexible systems? How does it help in integrating different interfaces in a media streaming application? Provide a specific example where the Adapter Pattern is particularly useful in real-world applications.
