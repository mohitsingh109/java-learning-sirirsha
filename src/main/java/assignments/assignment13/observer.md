# Java Assignment: Observer Pattern

## Scenario
You are developing a YouTube-like application where users can subscribe to different channels. When a channel uploads a new video, all its subscribers should be notified about the new content. To implement this functionality, you decide to use the Observer Pattern.

## Assignment Instructions
1. **Implement the Observer Interface**:
    - Create an interface `Subscriber` with a method `update(String videoTitle)` that will be called when a new video is uploaded.

2. **Concrete Observer Classes**:
    - Create classes that implement the `Subscriber` interface:
        - `User` class that represents a user of the application. It should have a name and implement the `update` method to print a notification message when a new video is uploaded.

3. **Subject Class**:
    - Create a class `YouTubeChannel` that maintains a list of subscribers and implements methods to:
        - `subscribe(Subscriber subscriber)` to add a subscriber.
        - `unsubscribe(Subscriber subscriber)` to remove a subscriber.
        - `notifySubscribers(String videoTitle)` to notify all subscribers when a new video is uploaded.

4. **Demonstrate the Observer Usage**:
    - Write a main application class that creates instances of `YouTubeChannel` and `User`.
    - Simulate users subscribing to a channel and uploading new videos. Show how all subscribed users are notified when a new video is uploaded.

5. **Unit Testing**:
    - Write unit tests to ensure that subscribers are correctly notified of new videos and that the subscription and unsubscription functionalities work as expected.

## Interview Question
**Question**: Can you explain the Observer Pattern and its importance in implementing event-driven systems? How does it promote loose coupling between the subject and its observers? Provide an example scenario where the Observer Pattern is particularly effective in real-world applications, such as in a social media or video sharing platform.