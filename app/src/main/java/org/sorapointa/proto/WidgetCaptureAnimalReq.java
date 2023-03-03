package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class WidgetCaptureAnimalReq {
    @Tag(tag=10) public Vector pos = null;
    @Tag(tag=15) public Integer entityId = null;
    @Tag(tag=6) public Integer materialId = null;
}
