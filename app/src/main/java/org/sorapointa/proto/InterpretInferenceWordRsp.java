package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InterpretInferenceWordRsp {
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer wordId = null;
    @Tag(tag=13) public Integer pageId = null;
}
