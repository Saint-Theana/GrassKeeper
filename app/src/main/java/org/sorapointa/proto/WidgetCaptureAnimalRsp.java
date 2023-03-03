package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class WidgetCaptureAnimalRsp {
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public Integer entityId = null;
    @Tag(tag=8) public Integer materialId = null;
    @Tag(tag=10) public Vector pos = null;
}
