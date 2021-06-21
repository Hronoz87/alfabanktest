package ru.netology.clients.mediaClients;

import ru.netology.clients.DownloadingGifInterface;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "media2", url = "${mediaUrl2}", qualifier = "media2")
public interface MediaClient2 extends DownloadingGifInterface {
}
