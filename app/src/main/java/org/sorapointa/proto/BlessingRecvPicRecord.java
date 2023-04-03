package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ProfilePicture.*;
import org.sorapointa.proto.ProfilePicture;

public class BlessingRecvPicRecord {
    @Tag(tag=11) public ProfilePicture profilePicture = null;
    @Tag(tag=10) public String signature = null;
    @Tag(tag=8) public Integer avatarId = null;
    @Tag(tag=5) public Integer uid = null;
    @Tag(tag=1) public Integer index = null;
    @Tag(tag=14) public String remarkName = null;
    @Tag(tag=2) public Integer picId = null;
    @Tag(tag=12) public String nickname = null;
    @Tag(tag=7) public Boolean isRecv = null;
}
