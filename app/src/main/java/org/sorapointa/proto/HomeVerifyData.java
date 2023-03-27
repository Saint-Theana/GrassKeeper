package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeVerifyData {
    @Tag(tag=10) public Integer uid = null;
    @Tag(tag=4) public String aid = null;
    @Tag(tag=2) public String token = null;
    @Tag(tag=14) public String region = null;
    @Tag(tag=11) public HomeVerifySceneData homeInfo = null;
    @Tag(tag=7) public HomeSceneArrangementMuipData arrangementData = null;
    @Tag(tag=1) public Integer lang = null;
    @Tag(tag=13) public Integer timestamp = null;
}
