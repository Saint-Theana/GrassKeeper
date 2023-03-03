package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ProfilePicture.*;
import org.sorapointa.proto.ProfilePicture;

public class HomeGroupPlayerInfo {
    @Tag(tag=14) public String onlineId = null;
    @Tag(tag=6) public String psnId = null;
    @Tag(tag=15) public String nickname = null;
    @Tag(tag=4) public Integer playerLevel = null;
    @Tag(tag=2) public Integer uid = null;
    @Tag(tag=5) public ProfilePicture profilePicture = null;
}
