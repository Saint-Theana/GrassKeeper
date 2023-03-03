package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DigActivityChangeGadgetStateRsp {
    @Tag(tag=15) public Integer entityId = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
}
