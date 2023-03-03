package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ProfilePicture.*;
import org.sorapointa.proto.ProfilePicture;

public class FleurFairPlayerStatInfo {
    @Tag(tag=11) public String onlineId = null;
    @Tag(tag=8) public Integer uid = null;
    @Tag(tag=1) public ProfilePicture profilePicture = null;
    @Tag(tag=3) public Integer statId = null;
    @Tag(tag=6) public Integer headImage = null;
    @Tag(tag=15) public String nickName = null;
    @Tag(tag=5,isSigned=true) public Integer param = null;
}
