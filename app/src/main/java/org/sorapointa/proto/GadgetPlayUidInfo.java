package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ProfilePicture.*;
import org.sorapointa.proto.ProfilePicture;

public class GadgetPlayUidInfo {
    @Tag(tag=7) public Integer score = null;
    @Tag(tag=1) public String onlineId = null;
    @Tag(tag=3) public Integer battleWatcherId = null;
    @Tag(tag=6) public ProfilePicture profilePicture = null;
    @Tag(tag=14) public Integer uid = null;
    @Tag(tag=9) public Integer icon = null;
    @Tag(tag=15) public String nickname = null;
}
