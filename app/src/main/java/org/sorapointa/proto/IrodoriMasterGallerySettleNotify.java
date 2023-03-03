package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.IrodoriMasterGallerySettleInfo.*;
import org.sorapointa.proto.IrodoriMasterGallerySettleInfo;

public class IrodoriMasterGallerySettleNotify {
    @Tag(tag=13) public IrodoriMasterGallerySettleInfo settleInfo = null;
    @Tag(tag=5) public Integer galleryId = null;
}
