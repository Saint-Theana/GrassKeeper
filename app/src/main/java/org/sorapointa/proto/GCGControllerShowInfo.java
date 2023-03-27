package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGControllerShowInfo {
    @Tag(tag=5) public String onlineId = null;
    @Tag(tag=6) public Integer controllerId = null;
    @Tag(tag=1) public String nickName = null;
    @Tag(tag=4) public ProfilePicture profilePicture = null;
    @Tag(tag=10) public String psnId = null;
}
