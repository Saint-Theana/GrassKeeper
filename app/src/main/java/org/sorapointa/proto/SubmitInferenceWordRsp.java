package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SubmitInferenceWordRsp {
    @Tag(tag=2) public Integer wordId = null;
    @Tag(tag=13) public Integer pageId = null;
    @Tag(tag=5) public Integer conclusionId = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
}
