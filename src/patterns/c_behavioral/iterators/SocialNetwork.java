package patterns.c_behavioral.iterators;

public interface SocialNetwork {

    ProfileIterator createFriendsIterator(String profileEmail);
    ProfileIterator createCoworkersIterator(String profileEmail);
}
