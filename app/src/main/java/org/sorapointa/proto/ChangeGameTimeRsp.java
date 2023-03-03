package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChangeGameTimeRsp {
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public Integer extraDays = null;
    @Tag(tag=14) public Integer curGameTime = null;
}
