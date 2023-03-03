package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HuntingPair.*;
import org.sorapointa.proto.HuntingPair;

public class HuntingGiveUpRsp {
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public HuntingPair huntingPair = null;
}
