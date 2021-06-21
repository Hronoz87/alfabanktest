package ru.netology.clients.mediaClients;

import ru.netology.clients.DownloadingGifInterface;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "media3", url = "${mediaUrl3}", qualifier = "media3")
public interface MediaClient3 extends DownloadingGifInterface {
}
