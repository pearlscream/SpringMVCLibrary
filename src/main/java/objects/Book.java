package objects;

/**
 * Created by dimon on 27.01.2016.
 */
public class Book {
    private String name;
    private Author author;
    private Genre genre;
    private Publisher publisher;
    private Vote vote;
    private Integer pageCount;
    private byte[] content;
    private byte[]imate;
    private String description;
    private Integer rating;
    private Long voteCount;
    private Integer publishYear;
    private String isbn;



    public Book() {

    }

    public Book(String name, Author author, Genre genre, Publisher publisher, Vote vote, Integer pageCount, byte[] content, byte[] imate, String description, Integer rate, Long voteCount, Integer publishYear) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.vote = vote;
        this.pageCount = pageCount;
        this.content = content;
        this.imate = imate;
        this.description = description;
        this.rating = rate;
        this.voteCount = voteCount;
        this.publishYear = publishYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Vote getVote() {
        return vote;
    }

    public void setVote(Vote vote) {
        this.vote = vote;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public byte[] getImate() {
        return imate;
    }

    public void setImate(byte[] imate) {
        this.imate = imate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Long getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Long voteCount) {
        this.voteCount = voteCount;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}

