package azure;

import java.io.File;
import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobClientBuilder;

public class BlobUploadExample {

    public static void main(String[] args) {

        // Define the connection string and blob name
        String connectionString =
                "BlobEndpoint=https://myth1storage.blob.core.windows.net/;QueueEndpoint=https://myth1storage.queue.core.windows.net/;FileEndpoint=https://myth1storage.file.core.windows.net/;TableEndpoint=https://myth1storage.table.core.windows.net/;SharedAccessSignature=sv=2022-11-02&ss=bfqt&srt=co&sp=rwdlacupiytfx&se=2023-05-07T12:46:00Z&st=2023-05-07T04:46:00Z&spr=https&sig=XvmMR1KYqZGHu2AZNzINerrKoMBGyraZi%2F%2F%2FHlrcOKs%3D";
        String containerName = "container";
        String blobName = "image1.jpg";

        // Create a BlobClientBuilder object using the connection string
        BlobClientBuilder blobClientBuilder =
                new BlobClientBuilder().connectionString(connectionString);

        // Create a BlobClient object for the blob
        BlobClient blobClient =
                blobClientBuilder.containerName(containerName).blobName(blobName).buildClient();

        // Define the file path of the file to upload
        String filePath =
                "C:/Users/Admin/Downloads/342343427_599898558760547_3850918944704870975_n.jpg";

        // Create a File object from the file path
        File file = new File(filePath);

        // Upload the file to the blob
        blobClient.uploadFromFile(file.getAbsolutePath());

        // Print a message indicating the upload was successful
        System.out.println("File uploaded successfully");
    }
}
