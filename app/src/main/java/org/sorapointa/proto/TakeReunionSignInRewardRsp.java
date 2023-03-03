package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ReunionSignInInfo.*;
import org.sorapointa.proto.ReunionSignInInfo;

public class TakeReunionSignInRewardRsp {
    @Tag(tag=10) public ReunionSignInInfo signInInfo = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
