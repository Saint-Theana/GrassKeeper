package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SignInInfo.*;
import org.sorapointa.proto.SignInInfo;

public class SignInInfoRsp {
    @Tag(tag=1) public List<SignInInfo> signInInfoList = new ArrayList<>();
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
}
