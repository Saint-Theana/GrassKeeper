package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeGroupPlayerInfo.*;
import org.sorapointa.proto.HomeGroupPlayerInfo;

public class HomeBalloonGalleryRecord {
    @Tag(tag=12) public Integer hitCount = null;
    @Tag(tag=11) public Integer score = null;
    @Tag(tag=5) public HomeGroupPlayerInfo playerInfo = null;
    @Tag(tag=2) public Integer timestamp = null;
}
