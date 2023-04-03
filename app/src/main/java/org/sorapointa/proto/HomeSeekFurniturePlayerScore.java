package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeGroupPlayerInfo.*;
import org.sorapointa.proto.HomeGroupPlayerInfo;

public class HomeSeekFurniturePlayerScore {
    @Tag(tag=4) public HomeGroupPlayerInfo playerInfo = null;
    @Tag(tag=9) public Integer score = null;
}
