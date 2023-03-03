package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetFriendRemarkNameReq {
    @Tag(tag=10) public Integer uid = null;
    @Tag(tag=8) public String remarkName = null;
}
