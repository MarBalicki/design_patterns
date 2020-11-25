package patterns.c_behavioral.iterators.example2;

public interface SocialNetwork {

    ProfileIterator createFriendsIterator(String profileEmail);
    ProfileIterator createCoworkersIterator(String profileEmail);
}
