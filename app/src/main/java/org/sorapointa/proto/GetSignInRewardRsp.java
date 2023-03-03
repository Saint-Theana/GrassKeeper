package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SignInInfo.*;
import org.sorapointa.proto.SignInInfo;

public class GetSignInRewardRsp {
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public SignInInfo signInInfo = null;
}
