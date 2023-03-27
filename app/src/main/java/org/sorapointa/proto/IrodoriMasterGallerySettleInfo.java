package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriMasterGallerySettleInfo {
    @Tag(tag=14) public Boolean isFinish = null;
    @Tag(tag=6) public Integer reason = null;
    @Tag(tag=10) public Integer difficult = null;
    @Tag(tag=15) public Integer finishTime = null;
    @Tag(tag=7) public Integer levelId = null;
}
