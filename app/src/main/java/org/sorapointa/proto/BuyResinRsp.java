package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BuyResinRsp {
    @Tag(tag=10) public Integer curValue = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
