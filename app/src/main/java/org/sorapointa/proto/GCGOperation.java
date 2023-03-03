package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGOperationAttack.*;
import org.sorapointa.proto.GCGOperationAttack;
import org.sorapointa.proto.GCGOperationOnStageSelect.*;
import org.sorapointa.proto.GCGOperationOnStageSelect;
import org.sorapointa.proto.GCGOperationPass.*;
import org.sorapointa.proto.GCGOperationPass;
import org.sorapointa.proto.GCGOperationPlayCard.*;
import org.sorapointa.proto.GCGOperationPlayCard;
import org.sorapointa.proto.GCGOperationReboot.*;
import org.sorapointa.proto.GCGOperationReboot;
import org.sorapointa.proto.GCGOperationRedraw.*;
import org.sorapointa.proto.GCGOperationRedraw;
import org.sorapointa.proto.GCGOperationReroll.*;
import org.sorapointa.proto.GCGOperationReroll;
import org.sorapointa.proto.GCGOperationSurrender.*;
import org.sorapointa.proto.GCGOperationSurrender;

public class GCGOperation {
    @Tag(tag=10) public GCGOperationRedraw opRedraw = null;
    @Tag(tag=4) public GCGOperationOnStageSelect opSelectOnStage = null;
    @Tag(tag=9) public GCGOperationReroll opReroll = null;
    @Tag(tag=11) public GCGOperationAttack opAttack = null;
    @Tag(tag=15) public GCGOperationPass opPass = null;
    @Tag(tag=2) public GCGOperationPlayCard opPlayCard = null;
    @Tag(tag=5) public GCGOperationReboot opReboot = null;
    @Tag(tag=1) public GCGOperationSurrender opSurrender = null;
}
