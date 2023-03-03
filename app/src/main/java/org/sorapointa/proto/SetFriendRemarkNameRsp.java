package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetFriendRemarkNameRsp {
    @Tag(tag=13) public String remarkName = null;
    @Tag(tag=3) public Boolean isClearRemark = null;
    @Tag(tag=10) public Integer uid = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
