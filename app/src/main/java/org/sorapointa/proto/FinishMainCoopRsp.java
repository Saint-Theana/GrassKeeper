package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FinishMainCoopRsp {
    @Tag(tag=2) public Integer id = null;
    @Tag(tag=6) public Integer endingSavePointId = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
