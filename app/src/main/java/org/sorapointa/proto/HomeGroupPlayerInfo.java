package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ProfilePicture.*;
import org.sorapointa.proto.ProfilePicture;

public class HomeGroupPlayerInfo {
    @Tag(tag=15) public String nickname = null;
    @Tag(tag=3) public Integer uid = null;
    @Tag(tag=14) public Integer playerLevel = null;
    @Tag(tag=11) public String onlineId = null;
    @Tag(tag=2) public ProfilePicture profilePicture = null;
    @Tag(tag=1) public String psnId = null;
}
