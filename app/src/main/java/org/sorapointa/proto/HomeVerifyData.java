package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeSceneArrangementMuipData.*;
import org.sorapointa.proto.HomeSceneArrangementMuipData;
import org.sorapointa.proto.HomeVerifySceneData.*;
import org.sorapointa.proto.HomeVerifySceneData;
import org.sorapointa.proto.LanguageType.*;
import org.sorapointa.proto.LanguageType;

public class HomeVerifyData {
    @Tag(tag=7) public String aid = null;
    @Tag(tag=15,isFixed=true) public Integer timestamp = null;
    @Tag(tag=5) public Integer uid = null;
    @Tag(tag=9) public HomeSceneArrangementMuipData arrangementData = null;
    @Tag(tag=3) public String region = null;
    @Tag(tag=1) public String token = null;
    @Tag(tag=6) public HomeVerifySceneData homeInfo = null;
    @Tag(tag=8) public Integer lang = null;
}
