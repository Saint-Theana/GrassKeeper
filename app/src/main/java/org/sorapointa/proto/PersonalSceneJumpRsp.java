package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class PersonalSceneJumpRsp {
    @Tag(tag=5) public Integer destSceneId = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Vector destPos = null;
}
