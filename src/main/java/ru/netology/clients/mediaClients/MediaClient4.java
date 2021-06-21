package ru.netology.clients.mediaClients;

import ru.netology.clients.DownloadingGifInterface;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "media4", url = "${mediaUrl4}", qualifier = "media4")
public interface MediaClient4 extends DownloadingGifInterface {
}
