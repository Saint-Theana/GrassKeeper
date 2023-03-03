package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeGroupPlayerInfo.*;
import org.sorapointa.proto.HomeGroupPlayerInfo;

public class HomeRacingGalleryRecord {
    @Tag(tag=1) public Integer useTime = null;
    @Tag(tag=8) public Integer timestamp = null;
    @Tag(tag=12) public HomeGroupPlayerInfo playerInfo = null;
}
