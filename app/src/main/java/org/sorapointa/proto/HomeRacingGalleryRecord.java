package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeRacingGalleryRecord {
    @Tag(tag=3) public Integer useTime = null;
    @Tag(tag=8) public Integer timestamp = null;
    @Tag(tag=4) public HomeGroupPlayerInfo playerInfo = null;
}
