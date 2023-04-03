package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ProfilePicture.*;
import org.sorapointa.proto.ProfilePicture;

public class FleurFairPlayerStatInfo {
    @Tag(tag=4,isSigned=true) public Integer param = null;
    @Tag(tag=14) public ProfilePicture profilePicture = null;
    @Tag(tag=3) public String onlineId = null;
    @Tag(tag=5) public String nickName = null;
    @Tag(tag=2) public Integer statId = null;
    @Tag(tag=8) public Integer headImage = null;
    @Tag(tag=13) public Integer uid = null;
}
