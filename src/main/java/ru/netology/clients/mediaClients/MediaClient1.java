package ru.netology.clients.mediaClients;

import ru.netology.clients.DownloadingGifInterface;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "media1", url = "${mediaUrl1}", qualifier = "media1")
public interface MediaClient1 extends DownloadingGifInterface {
}
