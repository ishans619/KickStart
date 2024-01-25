public class VideoStore {
    private Video[] inventory;

    public VideoStore() {
        this.inventory = new Video[10];
    }

    public void addVideo(String title) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = new Video(title);
                break;
            }
        }
    }

    public void checkOut(String title) {
        for (Video video : inventory) {
            if (video != null && video.getTitle().equals(title) && !video.isCheckedOut()) {
                video.checkOut();
                break;
            }
        }
    }

    public void returnVideo(String title) {
        for (Video video : inventory) {
            if (video != null && video.getTitle().equals(title) && video.isCheckedOut()) {
                video.returnVideo();
                break;
            }
        }
    }

    public void receiveRating(String title, int rating) {
        for (Video video : inventory) {
            if (video != null && video.getTitle().equals(title)) {
                video.receiveRating(rating);
                break;
            }
        }
    }

    public void listInventory() {
        for (Video video : inventory) {
            if (video != null) {
                System.out.println("Title: " + video.getTitle() +
                                   ", Checked Out: " + video.isCheckedOut() +
                                   ", Average Rating: " + video.getAverageRating());
            }
        }
    }
}

